.class public final Lc7/a;
.super LMj/h$a;
.source "SourceFile"


# instance fields
.field private final a:Lb7/a;


# direct methods
.method private constructor <init>(Lb7/a;)V
    .locals 1

    invoke-direct {p0}, LMj/h$a;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lc7/a;->a:Lb7/a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "TikXml (passed as parameter) is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static f(Lb7/a;)Lc7/a;
    .locals 1

    new-instance v0, Lc7/a;

    invoke-direct {v0, p0}, Lc7/a;-><init>(Lb7/a;)V

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 0

    new-instance p1, Lc7/b;

    iget-object p2, p0, Lc7/a;->a:Lb7/a;

    invoke-direct {p1, p2}, Lc7/b;-><init>(Lb7/a;)V

    return-object p1
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMj/x;)LMj/h;
    .locals 0

    instance-of p2, p1, Ljava/lang/Class;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/Class;

    new-instance p2, Lc7/c;

    iget-object p3, p0, Lc7/a;->a:Lb7/a;

    invoke-direct {p2, p3, p1}, Lc7/c;-><init>(Lb7/a;Ljava/lang/Class;)V

    return-object p2
.end method
