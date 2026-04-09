.class public final Ltg/s;
.super Lgg/s;
.source "SourceFile"

# interfaces
.implements LDg/e;


# static fields
.field public static final a:Lgg/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltg/s;

    invoke-direct {v0}, Ltg/s;-><init>()V

    sput-object v0, Ltg/s;->a:Lgg/s;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 0

    invoke-static {p1}, Llg/c;->complete(Lgg/x;)V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
