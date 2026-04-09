.class Lt5/p$a;
.super Lt5/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/p;->c()Lt5/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/reflect/Method;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lt5/p$a;->b:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lt5/p$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Lt5/p;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    invoke-static {p1}, Lt5/p;->a(Ljava/lang/Class;)V

    iget-object v0, p0, Lt5/p$a;->b:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lt5/p$a;->c:Ljava/lang/Object;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
