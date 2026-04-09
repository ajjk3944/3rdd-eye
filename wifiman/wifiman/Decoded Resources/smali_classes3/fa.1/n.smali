.class public final synthetic Lfa/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lfa/q;


# direct methods
.method public synthetic constructor <init>(Lfa/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa/n;->a:Lfa/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfa/n;->a:Lfa/q;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lfa/q;->k0(Lfa/q;Ljava/lang/Throwable;)LYg/J;

    move-result-object p1

    return-object p1
.end method
