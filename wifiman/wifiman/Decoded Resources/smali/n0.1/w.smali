.class public final synthetic Ln0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/j;


# instance fields
.field public final synthetic a:Ln0/y;


# direct methods
.method public synthetic constructor <init>(Ln0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/w;->a:Ln0/y;

    return-void
.end method


# virtual methods
.method public final a(D)D
    .locals 1

    iget-object v0, p0, Ln0/w;->a:Ln0/y;

    invoke-static {v0, p1, p2}, Ln0/x;->m(Ln0/y;D)D

    move-result-wide p1

    return-wide p1
.end method
