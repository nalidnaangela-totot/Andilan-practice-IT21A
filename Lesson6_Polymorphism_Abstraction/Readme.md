 Lesson 6 – Polymorphism and Abstraction

 What each program does

PolymorphismDemo.java kay all about sa pagluto og pagkaon. Naa koy parent class nga `Food` ug tulo ka child classes: `Adobo`, `Sinigang`, ug `FriedChicken`. Lahi ang ways or paagi sa pagluto sa matag pagkaon, ug lahi pud ang gidugayon sa pagluto. Gibutang nako silang tanan sa usa ka array ug gi-call nako ang parehas nga methods, ug ang matag pagkaon mo-respond sa iyang kaugalingong paagi.

AbstractionDemo.java kay mahitungod sa mga shape. Ang `Shape` kay abstract class, ug ang `Circle` ug `Rectangle` kay nag-extend niini. Ang program mo-create og usa ka circle ug usa ka rectangle, mo-print sa ilang ngalan, ug mo-compute sa ilang area.

 How polymorphism works in my code

-Parent class:`Food`
- Child classes: `Adobo`, `Sinigang`, `FriedChicken`
- Gi-override nga methods: `cook()` ug `cookingTimeMinutes()`, parehas naay `@Override`

Sa `main()`, ang variable kay parent type ang gigamit, pananglitan `Food food2 = new Adobo();`. Kung i-call nako ang `food2.cook()`, tan-awon sa Java kung unsa gyud ang object samtang nagdagan ang program, ug ang version sa `Adobo` ang mo run, dili ang sa parent. Mao nga ang parehas nga linya nga `f.cookingTimeMinutes()` sulod sa loop kay naghatag og 45 minutes para sa adobo, 60 para sa sinigang, ug 20 para sa fried chicken. Gigamit pud nako ang `super("Adobo")` sa constructors sa children aron ipasa ang ngalan paingon sa parent.

 How abstraction works in my code

- Abstract class: `Shape`
- Abstract method: `computeArea()`. Walay body kini sa parent kay dili man mahibaw-an sa general nga shape kung unsaon pag-compute sa area. Lahi ang formula sa circle ug sa rectangle.
- Implementations: Ang `Circle` mo-return og `3.14159 * radius * radius`, ug ang `Rectangle` mo-return og `length  width`.

Ang `Shape` naay regular method pud, ang `displayName()`, nga parehas ang paagi para sa tanang shapes, mao nga makausa ra kini isulat ug makuha na sa children. Ang user kinahanglan lang mahibalo nga ang matag shape makahatag og area. Ang detalye sa formula naa sulod sa matag child class.

Difference between polymorphism and abstraction

Ang abstraction kay mahitungod sa pagtago sa detalye ug pagpugos sa usa ka structure. Ang abstract class mosulti kung unsa ang kinahanglan mahimo sa matag child, pero ang children na ang mag-decide unsaon. Ang polymorphism kay mahitungod sa usa ka method call nga lahi ang resulta depende sa object. Sa mubo, ang abstraction kay kung giunsa nako pag-design ang classes, ug ang polymorphism kay unsa ang mahitabo kung gamiton na nako sila samtang nagdagan ang program. Sa akong programs, ang `Shape` nga nagpugos sa duha ka children nga magsulat og `computeArea()` kay abstraction, samtang ang `f.cook()` nga lahi ang resulta sa matag pagkaon kay polymorphism.

 Reflection questions

1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?
Kung walay overriding, parehas ra gyud ang buhat sa tanang children sa parent, mao nga walay "daghang porma". Tungod sa overriding, makahatag ang matag child og iyang kaugalingong version sa parehas nga method. Kung ang child dili mo-override, ang version sa parent ra ang gamiton sa Java. Sa akong code, makita ni siya sa plain nga `Food` object: ang default nga 10 minutes ang gamit niini kay wala man siyay override.

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?
Dili kompleto ang abstract class kay naay usa ka method (o labaw pa) nga walay body. Kung makahimo og object gikan niini ug i-call ang method, wala nay modagan. Sa akong code, walay meaning ang plain nga Shape kay wala man kay area nga ma-compute kung dili nimo mahibaw-an kung circle ba o rectangle. Ang limitasyon nagpugos sa programmer nga mogamit og saktong child class, aron walay object nga dili kompleto.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?
Mo-work ra kini nga halos walay changes. Pananglitan, kung magdugang ko og `class Lechon extends Food` nga naay iyang kaugalingong `@Override` methods, usa ra ka `new Lechon()` ang idugang nako sa array. Ang loop sa `main()` nagtrabaho na man sa `Food`, mao nga awtomatik nga ma-call ang methods sa bag-ong class. Dili nako kinahanglan usbon ang parent class o ang ubang children.

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.
Oo, pwede silang magkauban. Sa akong abstraction program, mahimo nako i-store ang objects gamit ang abstract type: Shape s1 = new Circle(5); ug Shape s2 = new Rectangle(4, 6);. Kung i-call ang s1.computeArea() ug s2.computeArea() sa Shape variables, ang saktong version sa child ang modagan. Ang abstract method mohatag og sigurado nga naa ang computeArea(), ug ang polymorphism mao ang mo-desisyon kung unsang version ang modagan. Mahimo pud nako ibutang ang duha ka shapes sa Shape[] array ug i-loop, ug i-call ang computeArea() sa matag usa.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?
Gamiton nako ang abstraction kung nag-design ko og grupo sa related nga classes nga naay parehas nga code pero kinahanglan lahi ang buhat sa usa ka parte, ug walay kahulogan ang plain nga parent object (sama sa generic nga shape). Gamiton nako ang polymorphism kung daghan akog objects nga related ang type ug gusto nako sila tanan i-handle gamit ang parehas nga code, sama sa pag-loop sa list ug pag-call sa usa ka method, imbes nga magsulat og taas nga if / else para sa matag type. Sa mas dagko nga programs, siguro gamiton nako ang duha nga magkauban.