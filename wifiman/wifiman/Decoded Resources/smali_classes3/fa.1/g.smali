.class public final synthetic Lfa/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lfa/f;

.field public final synthetic b:Lfa/j;


# direct methods
.method public synthetic constructor <init>(Lfa/f;Lfa/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa/g;->a:Lfa/f;

    iput-object p2, p0, Lfa/g;->b:Lfa/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfa/g;->a:Lfa/f;

    iget-object v1, p0, Lfa/g;->b:Lfa/j;

    invoke-static {v0, v1}, Lfa/i;->a(Lfa/f;Lfa/j;)LYg/J;

    move-result-object v0

    return-object v0
.end method
