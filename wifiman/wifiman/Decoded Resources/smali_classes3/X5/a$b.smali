.class public final LX5/a$b;
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
    name = "b"
.end annotation


# static fields
.field public static final a:LX5/a$b;

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

    new-instance v0, LX5/a$b;

    invoke-direct {v0}, LX5/a$b;-><init>()V

    sput-object v0, LX5/a$b;->a:LX5/a$b;

    const-wide v0, 0xde000000L

    sput-wide v0, LX5/a$b;->c:J

    const-wide/32 v0, 0x47000000

    sput-wide v0, LX5/a$b;->d:J

    sput-wide v0, LX5/a$b;->e:J

    const-wide v0, 0xff787878L

    sput-wide v0, LX5/a$b;->f:J

    const-wide v0, 0xff5a5a5aL

    sput-wide v0, LX5/a$b;->g:J

    const-wide v0, 0xff383838L

    sput-wide v0, LX5/a$b;->h:J

    const-wide v0, 0xff1a1a1aL

    sput-wide v0, LX5/a$b;->i:J

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

    sget-wide v0, LX5/a$b;->b:J

    return-wide v0
.end method

.method public b()J
    .locals 2

    sget-wide v0, LX5/a$b;->f:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    sget-wide v0, LX5/a$b;->e:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    sget-wide v0, LX5/a$b;->c:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    sget-wide v0, LX5/a$b;->g:J

    return-wide v0
.end method

.method public f()J
    .locals 2

    sget-wide v0, LX5/a$b;->h:J

    return-wide v0
.end method

.method public g()J
    .locals 2

    sget-wide v0, LX5/a$b;->d:J

    return-wide v0
.end method
