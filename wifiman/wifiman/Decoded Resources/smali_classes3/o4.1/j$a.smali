.class Lo4/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo4/j;->b(Lv4/d;)Lo4/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv4/d;


# direct methods
.method constructor <init>(Lv4/d;)V
    .locals 0

    iput-object p1, p0, Lo4/j$a;->a:Lv4/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lo4/h;
    .locals 2

    :try_start_0
    new-instance v0, Lo4/i;

    iget-object v1, p0, Lo4/j$a;->a:Lv4/d;

    invoke-direct {v0, v1, p1}, Lo4/i;-><init>(Lv4/d;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v1, "Primitive type not supported"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b()Lo4/h;
    .locals 3

    new-instance v0, Lo4/i;

    iget-object v1, p0, Lo4/j$a;->a:Lv4/d;

    invoke-virtual {v1}, Lv4/d;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo4/i;-><init>(Lv4/d;Ljava/lang/Class;)V

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lo4/j$a;->a:Lv4/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lo4/j$a;->a:Lv4/d;

    invoke-virtual {v0}, Lv4/d;->i()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
