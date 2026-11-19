What each program does?

PolymorphismDemo.java kay mahitungod sa mga tao nga nagtrabaho sa eskwelahan. Naa koy parent class nga `SchoolEmployee` ug tulo ka child classes: `Teacher`, `Janitor`, ug `SecurityGuard`.Isa Isa sa ila kay ga work in different way so ilahang sweldo kay different daily salary rate. Gibutang nako silang tanan sa usa ka array ug gi-call nako ang parehas nga methods, ug ang matag employee mo-respond sa iyang kaugalingong paagi.

AbstractionDemo.java kay mahitungod sa mga gamit sa balay. Ang `Appliance` kay abstract class, ug ang `ElectricFan` ug `RiceCooker` kay nag-extend niini. Ang program mo-create og usa ka fan ug usa ka rice cooker, i-plug in, i-operate, ug i-unplug. Lahi ang paagi sa pag-operate sa matag appliance.

How polymorphism works in my code?

- Parent class: `SchoolEmployee`
- Child classes: `Teacher`, `Janitor`, `SecurityGuard`
- Overridden methods: `doWork()` ug `computeSalary(int daysWorked)`, parehas naay `@Override`

Sa `main()`, ang variable kay parent type ang gigamit, pananglitan `SchoolEmployee emp2 = new Teacher("Ms. Santos");`. Kung i-call nako ang `emp2.doWork()`, tan-awon sa Java kung unsa gyud ang object samtang nagdagan ang program, ug ang version sa Teacher ang modagan, dili ang sa parent. Mao nga ang parehas nga linya nga `e.computeSalary(10)` sulod sa loop kay naghatag og PHP 12000 para sa teacher, PHP 6000 para sa janitor, ug PHP 7300 para sa security guard. Gigamit pud nako ang `super(name)` sa constructors sa children aron ipasa ang ngalan paingon sa parent.

How abstraction works in my code?

- Abstract class: `Appliance`
- Abstract method: `operate()`. Walay body sa parent kay dili man mahibaw-an sa general nga appliance kung unsa ang buhaton niini. Lahi kaayo ang buhat sa fan ug sa rice cooker.
- Implementations: Ang `ElectricFan` mo-print siya nga nagtuyok ug mo-blows og hangin, ug ang `RiceCooker` mo-print nga nag-init kini sa kaldero ug nagluto og kan-on.

Ang `Appliance` naay regular methods pud, ang `plugIn()` ug `unplug()`, nga parehas ang paagi para sa tanang appliances, mao nga ika isa ra ni isulat ug makuha na sa children. Ang user kinahanglan lang mahibalo nga ang matag appliance mahimong i-operate. So ang details nga unsaon siya pag work is naa ra inside each child class

Difference between polymorphism and abstraction

Ang abstraction is about sa pagtago sa detalye ug pag force sa structure. Ang abstract class mosulti kung unsa ang kinahanglan mahimo sa kada child, pero ang children na ang mag-desisyon unsaon ni. Ang polymorphism kay mahitungod sa usa ka method call nga lahi ang resulta depende sa object. In short, ang abstraction kay kung giunsa nako pag-design ang classes, ug ang polymorphism kay unsa ang mahitabo kung gamiton na nako sila while nagdagan ang program. Sa akong programs, ang `Appliance` kay gina force niya ang both children para magsulat og `operate()` kay abstraction, samtang ang `e.computeSalary(10)` nga lahi ang resulta sa matag empleyado kay polymorphism.

Reflection questions

1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?
-Kung walay overriding, parehas ra gyud ang mabuhat sa tanang children sa parent, mao nga walay "daghang porma". Tungod sa overriding, makahatag ang matag child og iyang kaugalingong version sa parehas nga method. Kung ang child dili mo-override, ang version sa parent ra ang gamiton sa Java. Sa akong code, makita kini sa plain nga `SchoolEmployee` object: ang default nga PHP 500 kada adlaw ang gamit ani kay wala man siyay override.

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?
Dili kompleto ang abstract class kay naay at least one method nga walay body. Kung makahimo og object gikan ani ug i-call ang method, wala nay modagan. Sa akong code, walay sense ang plain nga `Appliance` kay ang tinuod nga appliance kinahanglan fan, rice cooker, or something specific. Ang restriction kay i force ang programmer to use a proper child class, aron walay object nga dili kompleto.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?
Mo-work rani nga halos walay changes. Example, kung magdugang ko og `class GuidanceCounselor extends SchoolEmployee` nga naay iyang own `@Override` methods, usa ra ka `new GuidanceCounselor(...)` ang idugang nako sa array. Ang loop sa `main()` nagtrabaho na man sa `SchoolEmployee`, mao nga awtomatik nga ma-call ang methods sa bag-ong class. Dili nako kinahanglan usbon ang parent class o ang ubang children.

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Oo, sa akong abstraction program, mahimo nako i-store ang objects gamit ang abstract type: `Appliance a1 = new ElectricFan("Hanabishi");` ug `Appliance a2 = new RiceCooker("Imarflex");`. Kung i-call ang `a1.operate()` ug `a2.operate()` sa `Appliance` variables, ang saktong version sa child ang modagan. Ang abstract method mohatag og sigurado nga naa ang `operate()`, ug ang polymorphism mao ang mo-decide kung unsang version ang modagan. Mahimo pud nako ibutang ang duha ka appliances sa `Appliance[]` array ug i-loop, ug i-call ang `operate()` sa matag usa.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?
Gamiton nako ang abstraction kung mag design ko ug group sa related nga classes nga naay parehas nga code pero kinahanglan lahi ang buhat sa usa ka part, ug dili make sense ang plain nga parent object (sama sa generic nga appliance o shape). Gamiton nako ang polymorphism kung daghan akong objects nga related ang type ug gusto nako sila tanan i handle gamit ang parehas nga code, sama sa pag-loop sa list ug pag-call sa usa ka method, imbes nga magsulat og taas nga `if` / `else` para sa matag type. So in bigger programs I would probably use both together.