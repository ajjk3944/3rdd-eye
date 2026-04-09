.class public final synthetic Lp8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp8/a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c;

    check-cast p1, Lde/p;

    invoke-static {v0, p1}, Lp8/c;->r0(Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c;Lde/p;)Lde/p;

    move-result-object p1

    return-object p1
.end method
