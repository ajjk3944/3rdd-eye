.class public final synthetic Lcom/ui/wifiman/ui/settings/preferences/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/a;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/d;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/d;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->a(Lcom/ui/wifiman/ui/settings/preferences/a;Z)LYg/J;

    move-result-object p1

    return-object p1
.end method
