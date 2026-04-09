.class public final synthetic Lx8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lx8/j;


# direct methods
.method public synthetic constructor <init>(Lx8/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx8/f;->a:Lx8/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx8/f;->a:Lx8/j;

    invoke-static {v0}, Lx8/j;->w0(Lx8/j;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
