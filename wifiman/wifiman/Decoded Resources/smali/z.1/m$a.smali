.class final Lz/m$a;
.super Lz/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final e:Lz/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz/m$a;

    invoke-direct {v0}, Lz/m$a;-><init>()V

    sput-object v0, Lz/m$a;->e:Lz/m$a;

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

    div-int/lit8 p1, p1, 0x2

    return p1
.end method
