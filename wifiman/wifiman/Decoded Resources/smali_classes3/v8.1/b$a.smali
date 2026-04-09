.class final Lv8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8/b;-><init>(LSd/d;Lde/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lv8/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv8/b$a;

    invoke-direct {v0}, Lv8/b$a;-><init>()V

    sput-object v0, Lv8/b$a;->a:Lv8/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSd/d$a;Ljava/lang/Boolean;)Lv8/a$a;
    .locals 1

    const-string/jumbo v0, "directConnectionStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "alreadyRecommended"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, LSd/d$a$a$a;

    if-eqz p1, :cond_0

    new-instance p1, Lv8/a$a$a;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-direct {p1, p2}, Lv8/a$a$a;-><init>(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lv8/a$a$a;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-direct {p1, p2}, Lv8/a$a$a;-><init>(Z)V

    goto :goto_0

    :cond_1
    sget-object p1, Lv8/a$a$b;->a:Lv8/a$a$b;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSd/d$a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lv8/b$a;->a(LSd/d$a;Ljava/lang/Boolean;)Lv8/a$a;

    move-result-object p1

    return-object p1
.end method
