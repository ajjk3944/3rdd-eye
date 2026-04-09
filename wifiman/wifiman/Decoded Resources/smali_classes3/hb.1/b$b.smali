.class public final Lhb/b$b;
.super Lhb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lhb/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhb/b$b;

    invoke-direct {v0}, Lhb/b$b;-><init>()V

    sput-object v0, Lhb/b$b;->a:Lhb/b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lhb/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
