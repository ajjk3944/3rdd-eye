.class public final synthetic LH8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LH8/i;


# direct methods
.method public synthetic constructor <init>(LH8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/g;->a:LH8/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LH8/g;->a:LH8/i;

    check-cast p1, LYg/s;

    invoke-static {v0, p1}, LH8/i;->q0(LH8/i;LYg/s;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
