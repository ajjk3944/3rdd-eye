.class public final synthetic Lw8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lw8/t;


# direct methods
.method public synthetic constructor <init>(Lw8/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/r;->a:Lw8/t;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw8/r;->a:Lw8/t;

    invoke-static {v0}, Lw8/t;->g1(Lw8/t;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
