.class public final synthetic Laf/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;


# direct methods
.method public synthetic constructor <init>(LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/D;->a:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Laf/D;->a:LT/q0;

    check-cast p1, LC0/r;

    invoke-static {v0, p1}, Laf/H;->e(LT/q0;LC0/r;)LYg/J;

    move-result-object p1

    return-object p1
.end method
