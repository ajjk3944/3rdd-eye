.class public final synthetic Lp8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lp8/i;


# direct methods
.method public synthetic constructor <init>(Lp8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/g;->a:Lp8/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp8/g;->a:Lp8/i;

    invoke-static {v0}, Lp8/i;->z0(Lp8/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
