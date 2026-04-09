.class public final synthetic LS6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LS6/k;


# direct methods
.method public synthetic constructor <init>(LS6/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS6/l;->a:LS6/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS6/l;->a:LS6/k;

    check-cast p1, LJ0/w;

    invoke-static {v0, p1}, LS6/m;->a(LS6/k;LJ0/w;)LYg/J;

    move-result-object p1

    return-object p1
.end method
