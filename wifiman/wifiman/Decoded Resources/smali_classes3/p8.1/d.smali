.class public final synthetic Lp8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/discovery/prefs/lan/c;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/discovery/prefs/lan/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/d;->a:Lcom/ui/wifiman/ui/discovery/prefs/lan/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp8/d;->a:Lcom/ui/wifiman/ui/discovery/prefs/lan/c;

    check-cast p1, Lde/v;

    invoke-static {v0, p1}, Lp8/f;->r0(Lcom/ui/wifiman/ui/discovery/prefs/lan/c;Lde/v;)Lde/v;

    move-result-object p1

    return-object p1
.end method
