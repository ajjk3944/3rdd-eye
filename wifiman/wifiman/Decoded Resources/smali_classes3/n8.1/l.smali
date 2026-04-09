.class public final synthetic Ln8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ln8/k;


# direct methods
.method public synthetic constructor <init>(Ln8/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/l;->a:Ln8/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln8/l;->a:Ln8/k;

    check-cast p1, LCc/l;

    invoke-static {v0, p1}, Ln8/k$g;->a(Ln8/k;LCc/l;)LCc/l;

    move-result-object p1

    return-object p1
.end method
