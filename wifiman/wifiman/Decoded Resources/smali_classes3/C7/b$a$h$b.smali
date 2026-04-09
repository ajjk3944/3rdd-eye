.class public final LC7/b$a$h$b;
.super LC7/b$a$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:LC7/b$a$h$b;

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/b$a$h$b;

    invoke-direct {v0}, LC7/b$a$h$b;-><init>()V

    sput-object v0, LC7/b$a$h$b;->b:LC7/b$a$h$b;

    const/16 v0, 0x15

    sput v0, LC7/b$a$h$b;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LC7/b$a$h;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    sget v0, LC7/b$a$h$b;->c:I

    return v0
.end method
