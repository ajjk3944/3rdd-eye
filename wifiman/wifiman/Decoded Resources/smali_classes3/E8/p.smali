.class public final synthetic LE8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LE8/q;


# direct methods
.method public synthetic constructor <init>(LE8/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/p;->a:LE8/q;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE8/p;->a:LE8/q;

    invoke-static {v0}, LE8/q;->t0(LE8/q;)Landroidx/lifecycle/E;

    move-result-object v0

    return-object v0
.end method
