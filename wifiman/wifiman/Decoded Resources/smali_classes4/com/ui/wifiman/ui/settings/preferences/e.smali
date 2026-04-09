.class public final synthetic Lcom/ui/wifiman/ui/settings/preferences/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/a;

.field public final synthetic b:LT/z1;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/e;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    iput-object p2, p0, Lcom/ui/wifiman/ui/settings/preferences/e;->b:LT/z1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/e;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/settings/preferences/e;->b:LT/z1;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->a(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)LYg/J;

    move-result-object v0

    return-object v0
.end method
