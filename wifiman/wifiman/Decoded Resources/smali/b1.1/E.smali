.class public final Lb1/E;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/E$a;
    }
.end annotation


# static fields
.field public static final b:Lb1/E$a;

.field private static final c:Lb1/E;

.field private static final d:Lb1/E;

.field private static final e:Lb1/E;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb1/E$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb1/E$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lb1/E;->b:Lb1/E$a;

    new-instance v0, Lb1/E;

    const-string v1, "visible"

    invoke-direct {v0, v1}, Lb1/E;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb1/E;->c:Lb1/E;

    new-instance v0, Lb1/E;

    const-string v1, "invisible"

    invoke-direct {v0, v1}, Lb1/E;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb1/E;->d:Lb1/E;

    new-instance v0, Lb1/E;

    const-string v1, "gone"

    invoke-direct {v0, v1}, Lb1/E;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb1/E;->e:Lb1/E;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/E;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()Lb1/E;
    .locals 1

    sget-object v0, Lb1/E;->c:Lb1/E;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb1/E;->a:Ljava/lang/String;

    return-object v0
.end method
