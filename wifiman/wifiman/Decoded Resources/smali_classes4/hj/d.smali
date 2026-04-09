.class public Lhj/d;
.super Lhj/b;
.source "SourceFile"

# interfaces
.implements Lgj/c;
.implements Ljava/util/Iterator;


# static fields
.field public static final a:Lgj/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhj/d;

    invoke-direct {v0}, Lhj/d;-><init>()V

    sput-object v0, Lhj/d;->a:Lgj/c;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhj/b;-><init>()V

    return-void
.end method

.method public static a()Lgj/c;
    .locals 1

    sget-object v0, Lhj/d;->a:Lgj/c;

    return-object v0
.end method
