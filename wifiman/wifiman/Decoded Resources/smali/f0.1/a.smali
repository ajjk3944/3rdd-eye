.class public final Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf0/a;

.field private static final b:Lf0/c;

.field private static final c:Lf0/c;

.field private static final d:Lf0/c;

.field private static final e:Lf0/c;

.field private static final f:Lf0/c;

.field private static final g:Lf0/c;

.field private static final h:Lf0/c$b;

.field private static final i:Lf0/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf0/a;

    invoke-direct {v0}, Lf0/a;-><init>()V

    sput-object v0, Lf0/a;->a:Lf0/a;

    new-instance v0, Lf0/d;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {v0, v1, v1}, Lf0/d;-><init>(FF)V

    sput-object v0, Lf0/a;->b:Lf0/c;

    new-instance v0, Lf0/d;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v1}, Lf0/d;-><init>(FF)V

    sput-object v0, Lf0/a;->c:Lf0/c;

    new-instance v0, Lf0/d;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3}, Lf0/d;-><init>(FF)V

    sput-object v0, Lf0/a;->d:Lf0/c;

    new-instance v0, Lf0/d;

    invoke-direct {v0, v2, v3}, Lf0/d;-><init>(FF)V

    sput-object v0, Lf0/a;->e:Lf0/c;

    new-instance v0, Lf0/d;

    invoke-direct {v0, v1, v2}, Lf0/d;-><init>(FF)V

    sput-object v0, Lf0/a;->f:Lf0/c;

    new-instance v0, Lf0/d;

    invoke-direct {v0, v2, v2}, Lf0/d;-><init>(FF)V

    sput-object v0, Lf0/a;->g:Lf0/c;

    new-instance v0, Lf0/d$a;

    invoke-direct {v0, v1}, Lf0/d$a;-><init>(F)V

    sput-object v0, Lf0/a;->h:Lf0/c$b;

    new-instance v0, Lf0/d$a;

    invoke-direct {v0, v2}, Lf0/d$a;-><init>(F)V

    sput-object v0, Lf0/a;->i:Lf0/c$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lf0/c;
    .locals 1

    sget-object v0, Lf0/a;->b:Lf0/c;

    return-object v0
.end method

.method public final b()Lf0/c;
    .locals 1

    sget-object v0, Lf0/a;->c:Lf0/c;

    return-object v0
.end method
