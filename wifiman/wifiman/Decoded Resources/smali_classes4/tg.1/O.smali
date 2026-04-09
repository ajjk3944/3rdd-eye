.class public final Ltg/O;
.super Lgg/s;
.source "SourceFile"


# static fields
.field public static final a:Lgg/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltg/O;

    invoke-direct {v0}, Ltg/O;-><init>()V

    sput-object v0, Ltg/O;->a:Lgg/s;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    sget-object v0, Llg/c;->NEVER:Llg/c;

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    return-void
.end method
