.class public final synthetic LP8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LP8/i;


# direct methods
.method public synthetic constructor <init>(LP8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP8/h;->a:LP8/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LP8/h;->a:LP8/i;

    invoke-static {v0}, LP8/i;->q0(LP8/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
