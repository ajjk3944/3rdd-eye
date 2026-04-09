.class public final LP7/c$a;
.super LP7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LT7/b;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LT7/b;)V
    .locals 1

    const-string/jumbo v0, "daynight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LP7/c;-><init>()V

    iput-object p1, p0, LP7/c$a;->a:LT7/b;

    const-string/jumbo p1, "app_start_cold"

    iput-object p1, p0, LP7/c$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, LP7/c$a;->a:LT7/b;

    invoke-static {v1}, LR7/a;->a(LT7/b;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "daynight"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/c$a;->b:Ljava/lang/String;

    return-object v0
.end method
