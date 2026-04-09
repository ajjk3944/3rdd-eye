.class public LI2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 1

    new-instance p1, LI2/b;

    new-instance v0, LI2/b$a$a;

    invoke-direct {v0, p0}, LI2/b$a$a;-><init>(LI2/b$a;)V

    invoke-direct {p1, v0}, LI2/b;-><init>(LI2/b$b;)V

    return-object p1
.end method
