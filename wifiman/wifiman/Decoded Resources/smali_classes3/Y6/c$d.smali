.class LY6/c$d;
.super LY6/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY6/c;->a(Ljava/lang/Class;)LY6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/reflect/Method;

.field final synthetic b:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, LY6/c$d;->a:Ljava/lang/reflect/Method;

    iput-object p2, p0, LY6/c$d;->b:Ljava/lang/Class;

    invoke-direct {p0}, LY6/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LY6/c$d;->a:Ljava/lang/reflect/Method;

    iget-object v1, p0, LY6/c$d;->b:Ljava/lang/Class;

    const-class v2, Ljava/lang/Object;

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LY6/c$d;->b:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
