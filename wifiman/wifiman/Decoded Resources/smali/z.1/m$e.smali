.class final Lz/m$e;
.super Lz/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# static fields
.field public static final e:Lz/m$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz/m$e;

    invoke-direct {v0}, Lz/m$e;-><init>()V

    sput-object v0, Lz/m$e;->e:Lz/m$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lz/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(ILY0/t;Landroidx/compose/ui/layout/t;I)I
    .locals 0

    sget-object p3, LY0/t;->Ltr:LY0/t;

    if-ne p2, p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method
