.class final LD3/M;
.super LA5/e;
.source "SourceFile"


# direct methods
.method synthetic constructor <init>(LD3/L;)V
    .locals 0

    invoke-direct {p0}, LA5/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, LD3/B;

    new-instance v0, LD3/F;

    invoke-static {}, LA5/h;->c()LA5/h;

    move-result-object v1

    new-instance v2, LD3/C;

    invoke-static {}, LA5/h;->c()LA5/h;

    move-result-object v3

    invoke-virtual {v3}, LA5/h;->b()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, p1}, LD3/C;-><init>(Landroid/content/Context;LD3/B;)V

    invoke-virtual {p1}, LD3/B;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, LA5/h;->b()Landroid/content/Context;

    move-result-object v3

    const-class v4, LA5/k;

    invoke-virtual {v1, v4}, LA5/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA5/k;

    invoke-direct {v0, v3, v1, v2, p1}, LD3/F;-><init>(Landroid/content/Context;LA5/k;LD3/y;Ljava/lang/String;)V

    return-object v0
.end method
