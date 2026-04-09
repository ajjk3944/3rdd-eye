.class public LJ2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:LI2/m;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI2/m;

    const-wide/16 v1, 0x1f4

    invoke-direct {v0, v1, v2}, LI2/m;-><init>(J)V

    iput-object v0, p0, LJ2/a$a;->a:LI2/m;

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 1

    new-instance p1, LJ2/a;

    iget-object v0, p0, LJ2/a$a;->a:LI2/m;

    invoke-direct {p1, v0}, LJ2/a;-><init>(LI2/m;)V

    return-object p1
.end method
