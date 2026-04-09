.class public final Ls0/g$b;
.super Ls0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Ls0/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls0/g$b;

    invoke-direct {v0}, Ls0/g$b;-><init>()V

    sput-object v0, Ls0/g$b;->c:Ls0/g$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Ls0/g;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
