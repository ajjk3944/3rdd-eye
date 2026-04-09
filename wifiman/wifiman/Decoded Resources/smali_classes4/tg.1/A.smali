.class public final Ltg/A;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/A$a;
    }
.end annotation


# instance fields
.field final a:[Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/A;->a:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    new-instance v0, Ltg/A$a;

    iget-object v1, p0, Ltg/A;->a:[Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Ltg/A$a;-><init>(Lgg/x;[Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-boolean p1, v0, Ltg/A$a;->d:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ltg/A$a;->a()V

    return-void
.end method
