.class LTh/b$c$a;
.super LTh/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTh/b$c;->h()LSh/x$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LTh/b$c;


# direct methods
.method constructor <init>(LTh/b$c;)V
    .locals 0

    iput-object p1, p0, LTh/b$c$a;->b:LTh/b$c;

    invoke-direct {p0}, LTh/b$b;-><init>()V

    return-void
.end method

.method private static synthetic f(I)V
    .locals 2

    const-string p0, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1"

    const-string v0, "visitEnd"

    const-string v1, "result"

    filled-new-array {v1, p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected g([Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LTh/b$c$a;->f(I)V

    :cond_0
    iget-object v0, p0, LTh/b$c$a;->b:LTh/b$c;

    iget-object v0, v0, LTh/b$c;->a:LTh/b;

    invoke-static {v0, p1}, LTh/b;->k(LTh/b;[Ljava/lang/String;)[Ljava/lang/String;

    return-void
.end method
