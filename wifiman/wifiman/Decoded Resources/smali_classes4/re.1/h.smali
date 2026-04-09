.class public final synthetic Lre/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lre/g;


# direct methods
.method public synthetic constructor <init>(Lre/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/h;->a:Lre/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lre/h;->a:Lre/g;

    check-cast p1, Lcom/ui/wmw/wifi/a;

    invoke-static {v0, p1}, Lre/g$c;->a(Lre/g;Lcom/ui/wmw/wifi/a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
