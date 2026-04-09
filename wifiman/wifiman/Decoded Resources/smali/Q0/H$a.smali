.class public final LQ0/H$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ0/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LQ0/H$a;

.field private static final b:LQ0/H;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ0/H$a;

    invoke-direct {v0}, LQ0/H$a;-><init>()V

    sput-object v0, LQ0/H$a;->a:LQ0/H$a;

    new-instance v0, LQ0/H$a$a;

    invoke-direct {v0}, LQ0/H$a$a;-><init>()V

    sput-object v0, LQ0/H$a;->b:LQ0/H;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LQ0/H;
    .locals 1

    sget-object v0, LQ0/H$a;->b:LQ0/H;

    return-object v0
.end method
