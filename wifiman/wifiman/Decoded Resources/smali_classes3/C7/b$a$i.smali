.class public final LC7/b$a$i;
.super LC7/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final a:LC7/b$a$i;

.field private static final b:I

.field private static final c:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/b$a$i;

    invoke-direct {v0}, LC7/b$a$i;-><init>()V

    sput-object v0, LC7/b$a$i;->a:LC7/b$a$i;

    const/4 v0, 0x2

    sput v0, LC7/b$a$i;->b:I

    sget-object v0, LC7/b$a$i$a;->a:LC7/b$a$i$a;

    sput-object v0, LC7/b$a$i;->c:Lmh/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LC7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Lmh/l;
    .locals 1

    sget-object v0, LC7/b$a$i;->c:Lmh/l;

    return-object v0
.end method

.method public b()I
    .locals 1

    sget v0, LC7/b$a$i;->b:I

    return v0
.end method
