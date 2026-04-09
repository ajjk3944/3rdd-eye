.class public final synthetic LH8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LH8/q;


# direct methods
.method public synthetic constructor <init>(LH8/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/p;->a:LH8/q;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LH8/p;->a:LH8/q;

    invoke-static {v0}, LH8/q;->p0(LH8/q;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
