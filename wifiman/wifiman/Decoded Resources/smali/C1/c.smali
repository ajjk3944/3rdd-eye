.class public final LC1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC1/c$a;,
        LC1/c$d;,
        LC1/c$b;,
        LC1/c$c;
    }
.end annotation


# static fields
.field public static final b:LC1/c$a;


# instance fields
.field private final a:LC1/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC1/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LC1/c;->b:LC1/c$a;

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, LC1/c$c;

    invoke-direct {v0, p1}, LC1/c$c;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LC1/c$b;

    invoke-direct {v0, p1}, LC1/c$b;-><init>(Landroid/app/Activity;)V

    .line 5
    :goto_0
    iput-object v0, p0, LC1/c;->a:LC1/c$b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LC1/c;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic a(LC1/c;)V
    .locals 0

    invoke-direct {p0}, LC1/c;->b()V

    return-void
.end method

.method private final b()V
    .locals 1

    iget-object v0, p0, LC1/c;->a:LC1/c$b;

    invoke-virtual {v0}, LC1/c$b;->e()V

    return-void
.end method


# virtual methods
.method public final c(LC1/c$d;)V
    .locals 1

    const-string v0, "condition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC1/c;->a:LC1/c$b;

    invoke-virtual {v0, p1}, LC1/c$b;->f(LC1/c$d;)V

    return-void
.end method
