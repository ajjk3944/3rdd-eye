.class public final synthetic Lh8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lh8/b;


# direct methods
.method public synthetic constructor <init>(Lh8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/a;->a:Lh8/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh8/a;->a:Lh8/b;

    invoke-static {v0}, Lh8/b;->T0(Lh8/b;)Lh8/e;

    move-result-object v0

    return-object v0
.end method
