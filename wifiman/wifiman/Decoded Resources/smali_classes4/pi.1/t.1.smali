.class public abstract Lpi/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[Lth/l;

.field private static final b:Lph/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lpi/t;

    const-string v2, "descriptors"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/O;->d(Ljava/lang/Class;Ljava/lang/String;)Lth/f;

    move-result-object v1

    const-string v2, "annotationsAttribute"

    const-string v3, "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lpi/t;->a:[Lth/l;

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    const-class v1, Lpi/s;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lui/z;->c(Lth/d;)Lui/n;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lpi/t;->b:Lph/c;

    return-void
.end method

.method public static final a(Lpi/r0;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpi/t;->b(Lpi/r0;)Lpi/s;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lpi/s;->e()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final b(Lpi/r0;)Lpi/s;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpi/t;->b:Lph/c;

    sget-object v1, Lpi/t;->a:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lph/c;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/s;

    return-object p0
.end method
