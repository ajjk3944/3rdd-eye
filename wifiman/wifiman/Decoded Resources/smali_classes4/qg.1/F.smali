.class public final Lqg/F;
.super Lgg/i;
.source "SourceFile"


# instance fields
.field final b:LDj/a;


# direct methods
.method public constructor <init>(LDj/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/F;->b:LDj/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 1

    iget-object v0, p0, Lqg/F;->b:LDj/a;

    invoke-interface {v0, p1}, LDj/a;->b(LDj/b;)V

    return-void
.end method
