.class public final synthetic Lxe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lxe/r0;


# direct methods
.method public synthetic constructor <init>(Lxe/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/j;->a:Lxe/r0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxe/j;->a:Lxe/r0;

    check-cast p1, Lf2/u;

    invoke-static {v0, p1}, Lxe/B;->h(Lxe/r0;Lf2/u;)LYg/J;

    move-result-object p1

    return-object p1
.end method
