.class public final Lhb/b$d;
.super Lhb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Lhb/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhb/b$d;

    invoke-direct {v0}, Lhb/b$d;-><init>()V

    sput-object v0, Lhb/b$d;->a:Lhb/b$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lhb/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
