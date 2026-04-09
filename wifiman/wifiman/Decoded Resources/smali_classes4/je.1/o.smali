.class public final synthetic Lje/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lje/p;

.field public final synthetic b:Lje/q;


# direct methods
.method public synthetic constructor <init>(Lje/p;Lje/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje/o;->a:Lje/p;

    iput-object p2, p0, Lje/o;->b:Lje/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lje/o;->a:Lje/p;

    iget-object v1, p0, Lje/o;->b:Lje/q;

    check-cast p1, Landroid/net/wifi/MloLink;

    invoke-static {v0, v1, p1}, Lje/p;->c(Lje/p;Lje/q;Landroid/net/wifi/MloLink;)Lje/q;

    move-result-object p1

    return-object p1
.end method
