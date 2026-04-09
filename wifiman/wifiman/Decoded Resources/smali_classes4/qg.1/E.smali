.class public final Lqg/E;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/E$a;
    }
.end annotation


# instance fields
.field private final b:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/E;->b:Lgg/v;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    iget-object v0, p0, Lqg/E;->b:Lgg/v;

    new-instance v1, Lqg/E$a;

    invoke-direct {v1, p1}, Lqg/E$a;-><init>(LDj/b;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
