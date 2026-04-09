.class public interface abstract LF4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF4/h;

    invoke-direct {v0}, LF4/h;-><init>()V

    sput-object v0, LF4/i;->a:LF4/i;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
.end method
