.class public final Lw4/l$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lw4/l$c;

.field public static final c:Lw4/l$c;

.field public static final d:Lw4/l$c;

.field public static final e:Lw4/l$c;

.field public static final f:Lw4/l$c;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw4/l$c;

    const-string/jumbo v1, "SHA1"

    invoke-direct {v0, v1}, Lw4/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw4/l$c;->b:Lw4/l$c;

    new-instance v0, Lw4/l$c;

    const-string/jumbo v1, "SHA224"

    invoke-direct {v0, v1}, Lw4/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw4/l$c;->c:Lw4/l$c;

    new-instance v0, Lw4/l$c;

    const-string/jumbo v1, "SHA256"

    invoke-direct {v0, v1}, Lw4/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw4/l$c;->d:Lw4/l$c;

    new-instance v0, Lw4/l$c;

    const-string/jumbo v1, "SHA384"

    invoke-direct {v0, v1}, Lw4/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw4/l$c;->e:Lw4/l$c;

    new-instance v0, Lw4/l$c;

    const-string/jumbo v1, "SHA512"

    invoke-direct {v0, v1}, Lw4/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw4/l$c;->f:Lw4/l$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/l$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw4/l$c;->a:Ljava/lang/String;

    return-object v0
.end method
