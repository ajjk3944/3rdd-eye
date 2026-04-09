.class public interface abstract Loi/f$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "f"
.end annotation


# static fields
.field public static final a:Loi/f$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loi/f$f$a;

    invoke-direct {v0}, Loi/f$f$a;-><init>()V

    sput-object v0, Loi/f$f;->a:Loi/f$f;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
.end method
