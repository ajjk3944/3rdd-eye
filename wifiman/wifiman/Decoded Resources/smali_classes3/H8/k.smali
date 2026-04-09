.class public final synthetic LH8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LH8/l;


# direct methods
.method public synthetic constructor <init>(LH8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/k;->a:LH8/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LH8/k;->a:LH8/l;

    invoke-static {v0}, LH8/l;->u0(LH8/l;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
