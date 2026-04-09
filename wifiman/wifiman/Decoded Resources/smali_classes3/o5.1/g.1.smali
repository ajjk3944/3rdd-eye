.class public final Lo5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/g$a;
    }
.end annotation


# static fields
.field public static final b:Lo5/g$a;


# instance fields
.field private final a:Lf5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo5/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo5/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo5/g;->b:Lo5/g$a;

    return-void
.end method

.method public constructor <init>(Lf5/b;)V
    .locals 1

    const-string/jumbo v0, "transportFactoryProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/g;->a:Lf5/b;

    return-void
.end method

.method public static synthetic b(Lo5/g;Lo5/z;)[B
    .locals 0

    invoke-direct {p0, p1}, Lo5/g;->c(Lo5/z;)[B

    move-result-object p0

    return-object p0
.end method

.method private final c(Lo5/z;)[B
    .locals 3

    sget-object v0, Lo5/A;->a:Lo5/A;

    invoke-virtual {v0}, Lo5/A;->c()LZ4/a;

    move-result-object v0

    invoke-interface {v0, p1}, LZ4/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Session Event Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lo5/z;->b()Lo5/i;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "EventGDTLogger"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string/jumbo v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(Lo5/z;)V
    .locals 5

    const-string/jumbo v0, "sessionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo5/g;->a:Lf5/b;

    invoke-interface {v0}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/i;

    const-string/jumbo v1, "json"

    invoke-static {v1}, La3/b;->b(Ljava/lang/String;)La3/b;

    move-result-object v1

    new-instance v2, Lo5/f;

    invoke-direct {v2, p0}, Lo5/f;-><init>(Lo5/g;)V

    const-string/jumbo v3, "FIREBASE_APPQUALITY_SESSION"

    const-class v4, Lo5/z;

    invoke-interface {v0, v3, v4, v1, v2}, La3/i;->a(Ljava/lang/String;Ljava/lang/Class;La3/b;La3/g;)La3/h;

    move-result-object v0

    invoke-static {p1}, La3/c;->f(Ljava/lang/Object;)La3/c;

    move-result-object p1

    invoke-interface {v0, p1}, La3/h;->b(La3/c;)V

    return-void
.end method
