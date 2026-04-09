.class public abstract LI2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:LI2/g$d;


# direct methods
.method public constructor <init>(LI2/g$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/g$a;->a:LI2/g$d;

    return-void
.end method


# virtual methods
.method public final d(LI2/r;)LI2/n;
    .locals 1

    new-instance p1, LI2/g;

    iget-object v0, p0, LI2/g$a;->a:LI2/g$d;

    invoke-direct {p1, v0}, LI2/g;-><init>(LI2/g$d;)V

    return-object p1
.end method
