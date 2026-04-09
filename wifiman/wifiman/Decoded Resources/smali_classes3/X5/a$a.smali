.class public final LX5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LX5/a$a;

.field private static final b:J

.field private static final c:J

.field private static final d:J

.field private static final e:J

.field private static final f:J

.field private static final g:J

.field private static final h:J

.field private static final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX5/a$a;

    invoke-direct {v0}, LX5/a$a;-><init>()V

    sput-object v0, LX5/a$a;->a:LX5/a$a;

    const-wide v0, 0xffffffffL

    sput-wide v0, LX5/a$a;->b:J

    sput-wide v0, LX5/a$a;->c:J

    const-wide v0, 0xff424242L

    sput-wide v0, LX5/a$a;->d:J

    const-wide v0, 0xff555555L

    sput-wide v0, LX5/a$a;->e:J

    const-wide v0, 0xffcacacaL

    sput-wide v0, LX5/a$a;->f:J

    const-wide v0, 0xffa8a8a8L

    sput-wide v0, LX5/a$a;->g:J

    const-wide v0, 0xff888888L

    sput-wide v0, LX5/a$a;->h:J

    const-wide v0, 0xffefefefL

    sput-wide v0, LX5/a$a;->i:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    sget-wide v0, LX5/a$a;->b:J

    return-wide v0
.end method

.method public b()J
    .locals 2

    sget-wide v0, LX5/a$a;->f:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    sget-wide v0, LX5/a$a;->e:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    sget-wide v0, LX5/a$a;->c:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    sget-wide v0, LX5/a$a;->g:J

    return-wide v0
.end method

.method public f()J
    .locals 2

    sget-wide v0, LX5/a$a;->h:J

    return-wide v0
.end method

.method public g()J
    .locals 2

    sget-wide v0, LX5/a$a;->d:J

    return-wide v0
.end method
